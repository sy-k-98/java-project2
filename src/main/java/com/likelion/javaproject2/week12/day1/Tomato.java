package com.likelion.javaproject2.week12.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// boj - 토마토
// https://www.acmicpc.net/problem/7569
public class Tomato {
    // x의 변화
    private final int[] dx = {-1, 1, 0, 0, 0, 0};
    // y의 변화
    private final int[] dy = {0, 0, -1, 1, 0, 0};
    // z의 변화
    private final int[] dh = {0, 0, 0, 0, -1, 1};

    // 상자의 크기
    private int x;
    private int y;
    private int h;

    public int solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // X, Y, H 입력
        StringTokenizer infoParser = new StringTokenizer(reader.readLine());
        x = Integer.parseInt(infoParser.nextToken());
        y = Integer.parseInt(infoParser.nextToken());
        h = Integer.parseInt(infoParser.nextToken());

        // 토마토 정보를 담을 상자 3차원 배열
        int[][][] tomatoRack = new int[h][y][x];

        // 데이터 입력받으면서 첫번째 방문 위치 찾기
        Queue<int[]> toVisit = new LinkedList<>();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < y; j++) {
                StringTokenizer rowParser = new StringTokenizer(reader.readLine());
                for (int k = 0; k < x; k++) {
                    // 토마토 정보 받아오기
                    int tomato = Integer.parseInt(rowParser.nextToken());
                    if (tomato == 1) {
                        // 이미 익은 토마토들부터 시작 {h, y, x, days}
                        toVisit.add(new int[]{i, j, k, 0});
                    }
                    tomatoRack[i][j][k] = tomato;
                }
            }
        }

        // 총 일수 저장 변수
        int days = 0;

        // BFS 시작
        while (!toVisit.isEmpty()) {
            int[] tomato = toVisit.poll();
            // 이번에 확인한 토마토가 익은 시점이 현재 기록된 시간보다 늦을 경우 갱신
            if (days != tomato[3]) days = tomato[3];
            // 상하좌우 + 위아래 체크
            for (int i = 0; i < 6; i++) {
                int nh = tomato[0] + dh[i];
                int ny = tomato[1] + dy[i];
                int nx = tomato[2] + dx[i];

                // 1. 영역을 벗어나지 않는다
                // 2. 익지 않은 토마토이다
                if (checkBounds(nx, ny, nh)
                        && tomatoRack[nh][ny][nx] == 0) {
                    // 토마토 익음
                    tomatoRack[nh][ny][nx] = 1;
                    // 다음날에 토마토는 익어있음
                    toVisit.offer(new int[]{nh, ny, nx, tomato[3] + 1});
                }
            }
        }

        // 익지 않는 토마토 존재 확인
        for (int i = 0; i < this.h; i++) {
            for (int j = 0; j < this.y; j++) {
                for (int k = 0; k < this.x; k++) {
                    // 하나라도 익지 않은 토마토가 있다면 -1
                    if (tomatoRack[i][j][k] == 0) return -1;
                }
            }
        }
        // 아니라면 여태 소요 시간
        return days;
    }


    private boolean checkBounds(int x, int y, int h) {
        return
                -1 < x && x < this.x
                        && -1 < y && y < this.y
                        && -1 < h && h < this.h;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new Tomato().solution());
    }
}
