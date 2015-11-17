public class Solution {

    public void rotate(int[][] matrix) {

        //rotate 90C 意味着沿着副对角线翻转一次，再沿着水平中线翻转一次

        //或者先沿着水平中线翻转一次，再沿着主对角线翻转一次

        int len=matrix.length;

        for(int i=0;i<len;i++)

        {

            for(int j=0;j<len-i;j++)

            {

                int tmp=matrix[i][j];

                matrix[i][j]=matrix[len-1-j][len-1-i];

                matrix[len-1-j][len-1-i]=tmp;

            }

        }

        for(int i=0;i<len/2;i++)

        {

            for(int j=0;j<len;j++)

            {

                int tmp=matrix[i][j];

                matrix[i][j]=matrix[len-1-i][j];

                matrix[len-1-i][j]=tmp;

            }

        }

        

    }

}
