import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class WayTooLongWords {
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        int t = 1;
        // Uncomment if problem has test cases:
        // t = scanner.nextInt();

        while (t-- > 0) {
            solve(scanner, out);
        }

        out.flush(); // Always flush at the end!
    }

    private static void solve(FastScanner in, PrintWriter out) {
        String str = in.next();
        int len = str.length();
        
        if (len > 10) {
            out.println(str.charAt(0) + "" + (len - 2) + str.charAt(len - 1));
        } else {
            out.println(str);
        }
    }
}
