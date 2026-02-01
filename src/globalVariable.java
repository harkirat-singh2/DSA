public class globalVariable {
        public static int forloophcf(int n,int m){
            int hcf=1;
            for (int i = 1; i < Math.max(n,m); i++) {
                    if (n%i==0 &&    m%i==0) {
                        hcf = i;

                    }

            }return hcf;
        }
        static int x =10;   // local variable
        public static void main(String[] args) {
            System.out.println(x);
            x = 9;  // local variable
            System.out.println(x);
            int x = 4;
            System.out.println(x);
            x = 6;
            System.out.println(x);
            System.out.println(forloophcf(12,16));
        }
            }

