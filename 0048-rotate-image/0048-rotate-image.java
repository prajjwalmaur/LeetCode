class Solution {
    public void rotate(int[][] matrix) {
        int l = matrix.length ;
        double ln = Math.ceil(l /2.0);
        l--;
        System.out.println(ln);
        for ( int i = 0 ; i < ln ; i++){
            for( int j = i ; j < l-i ; j++ ){
                int temp = matrix[j][l-i];
                matrix[j][l-i] = matrix[i][j];
                int temp2 = matrix[l-i][l-j];
                matrix[l-i][l-j] = temp;
                temp = matrix[l-j][i] ;
                matrix[l-j][i] = temp2;
                matrix[i][j] = temp;
            }
        }
    }
}