package dfs;
// 방향 없는 그래프가 주어졌을 때,
// 연결 요소 (Connected Component)의 개수를 구하는 프로그램을 작성하시오
// 첫째 줄에 정점의 개수 N과 간선의 개수 M (1 ≤ N ≤ 1,000, 0 ≤ M ≤ N×(N-1)/2)
// 둘째 줄부터 M개의 줄에 간선의 양 끝점 u와 v (1 ≤ u, v ≤ N, u ≠ v) 같은 간선은 한 번만 주어진다.
// 첫째 줄에 연결 요소의 개수를 출력한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ConnComponent11724 {
    static boolean[] visited;
    static ArrayList<Integer>[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        visited = new boolean[n+1];
        A = new ArrayList[n+1];
        for(int i=1;i<=n;i++) {
            A[i] = new ArrayList<Integer>();
        }
        for(int i=1;i<=m;i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }
        int count = 0;
        for(int i=1;i<=n;i++) {
            if(!visited[i]) {
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }

    private static void DFS(int v) {
        if(visited[v]) return;
        visited[v] = true;
        for(int i : A[v]) {
            if(!visited[i]) {
                DFS(i);
            }
        }
    }
}


