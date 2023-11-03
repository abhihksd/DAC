package graphs;

public class DemoGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g=new Graph(3);
		int [][] arr= {{0,1,1},{0,0,0},{1,1,0}};
		g.acceptGraph(arr);
		g.displayAdjacencyMatrix();
		System.out.println("In degree");
		g.getInDegree();
		System.out.println("Out degree");
		g.getOutDegree();
		System.out.println("Traversing Depth first Search");
		g.dfs(0);

	}

}
