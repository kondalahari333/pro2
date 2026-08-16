import java.util.StringTokenizer;

class st1{
    public static void main(String[] args) {
        String s="Jhon,Doe,25,New York";
        StringTokenizer sb=new StringTokenizer(s,",");
        while(sb.hasMoreTokens()){
            System.out.println(sb.nextToken());
        }

    }
}