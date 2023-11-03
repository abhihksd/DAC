package graphs;

import java.util.Arrays;
import java.util.Scanner;

public class Graph {
	int ver;
	int [][]arr;
	public Graph(int size)
	{
		ver=size;
		arr=new int[size][size];
		
	}
	public void acceptGraph(int [][]arr)
	{
		this.arr=arr;
	}
	public void acceptGraph()
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<ver;i++)
		{
			for(int j=0;j<ver;j++)
			{
				System.out.println("Enter ajacent for: "+i+" and " +j);
				arr[i][j]=sc.nextInt();
			}
		}sc.close();
	}
	public void addEdge(int i,int j)
	{
		arr[i][j]=1;
		arr[j][i]=1;
	}
	public void displayAdjacencyMatrix()
	{
		for(int i=0;i<ver;i++)
		{
			for(int j=0;j<ver;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public void getInDegree()
	{
		int cnt=0;
		for(int i=0;i<ver;i++)
		{
			cnt=0;
			for(int j=0;j<ver;j++)
			{
				if(arr[j][i]==1)
					cnt++;
			}System.out.println(cnt);
		}
	}
	
	public void getOutDegree()
	{
		int cnt=0;
		for(int i=0;i<ver;i++)
		{
			cnt=0;
			for(int j=0;j<ver;j++)
			{
				if(arr[i][j]==1)
					cnt++;
			}System.out.println(cnt);
		}
	}
	public void dfs(int start)
	{
		boolean [] visited=new boolean[ver];
		
		System.out.println("DFS");
		System.out.println(start+" ");
		visited[start]=true;
		travDFS(visited,start);
	}
	public void travDFS(boolean v[],int star)
	{
		for(int j=0;j<ver;j++)
		{
			if(arr[star][j]==1&& v[j]==false) 
			{
				v[j]=true;
				System.out.println(j+" ");
				travDFS(v,j);	
			}
			
		}
	}
	

}
