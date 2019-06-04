
public class COdeArena5{}
//import java.util.*;
//public class COdeArena5 {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		ArrayList<String> ac=new ArrayList<>();
//		ArrayList<String> bd=new ArrayList<>();
//		int n=sc.nextInt();
//		boolean demo=false;
//		for(int i=0;i<n;i++) {
//			int Ax=sc.nextInt();
//			int Ay=sc.nextInt();
//			int Bx=sc.nextInt();
//			int By=sc.nextInt();
//			int Cx=sc.nextInt();
//			int Cy=sc.nextInt();
//			int Dx=sc.nextInt();
//			int Dy=sc.nextInt();
//			 Point p1=new Point();
//			 p1.x=Ax;
//			 p1.y=Ay;
//			 Point q1=new Point();
//			 q1.x=Cx;
//			 q1.y=Cy;
//			 Point p2=new Point();
//			 p2.x=Bx;
//			 p2.y=By;
//			 Point q2=new Point();
//			 q2.x=Dx;
//			 q2.y=Dy;
//		     COdeArena5 obj=new COdeArena5();
//		     demo=obj.doIntersect(p1, q1, p2, q2); 
//			
//		}
//		if(demo) {
//		System.out.println("Yes");
//		}
//		else {
//			System.out.println("No");
//		}
//	}
//	int orientation(Point p, Point q, Point r) 
//	{ 
//
//	    int val = (q.y - p.y) * (r.x - q.x) - 
//	              (q.x - p.x) * (r.y - q.y); 
//	  
//	    if (val == 0) return 0;  
//	  
//	    return (val > 0)? 1: 2;
//	}
//	boolean onSegment(Point p, Point q, Point r) 
//	{ 
//	    if (q.x <= Math.max(p.x, r.x) && q.x >= Math.min(p.x, r.x) && 
//	        q.y <= Math.max(p.y, r.y) && q.y >= Math.min(p.y, r.y)) 
//	       return true; 
//	  
//	    return false; 
//	} 
//	  
//	boolean doIntersect(Point p1, Point q1, Point p2, Point q2) 
//	{ 
//	
//	    int o1 = orientation(p1, q1, p2); 
//	    int o2 = orientation(p1, q1, q2); 
//	    int o3 = orientation(p2, q2, p1); 
//	    int o4 = orientation(p2, q2, q1); 
//	  
//
//	    if (o1 != o2 && o3 != o4) 
//	        return true; 
//	  
//	
//	    if (o1 == 0 && onSegment(p1, p2, q1)) return true; 
//	  
//	    if (o2 == 0 && onSegment(p1, q2, q1)) return true; 
//
//	    if (o3 == 0 && onSegment(p2, p1, q2)) return true; 
//	  
//
//	    if (o4 == 0 && onSegment(p2, q1, q2)) return true; 
//	  
//	    return false; 
//	} 
//}
//class Point 
//{ 
//    int x; 
//    int y; 
//}; 
