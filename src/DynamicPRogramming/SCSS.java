package src.DynamicPRogramming;

public class SCSS {

        // Function to find and return the shortest common supersequence

            public static String shortestCommonSupersequence(String str1, String str2) {
                int n=str1.length();
                int m=str2.length();
                int [][]t =new int[n+1][m+1];
                return scss(str1.toCharArray(),str2.toCharArray(),n,m,t);
            }
            public static String scss(char[]X,char[]Y,int n,int m,int[][]t){
                for(int i=0;i<n+1;i++){
                    for(int j=0;j<m+1;j++){
                        if(i==0 || j==0){
                            t[i][j]=0;
                        }
                    }
                }
                for(int i=1;i<n+1;i++){
                    for(int j=1;j<m+1;j++){
                        if(X[i-1]==Y[j-1]){
                            t[i][j]=1+t[i-1][j-1];
                        }else{
                            t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                        }
                    }
                }
                StringBuilder s=new StringBuilder();
                int i=n;
                int j=m;
                while(i>0 && j>0){
                    if(X[i-1]==Y[j-1]){
                        s.append(X[i-1]);
                        i--;
                        j--;
                    }else if(t[i-1][j]>t[i][j-1]){
                        s.append(X[i-1]);
                        i--;
                    }else{
                        s.append(Y[j-1]);
                        j--;
                    }
                }
                while(i>0){
                    s.append(X[i-1]);
                    i--;
                }
                while(j>0){
                    s.append(Y[j-1]);
                    j--;
                }
                return s.reverse().toString();

            }



        public static void main(String[] args) {
            String s1 = "AGGTAB";
            String s2 = "GXTXAYB";
            System.out.println(shortestCommonSupersequence(s1, s2));
        }
        }


