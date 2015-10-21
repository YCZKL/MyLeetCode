c class Solution {

    public int compareVersion(String version1, String version2) {

        if(version1==null || version1.length()==0||version2==null || version2.length()==0)

        {

            return 0;

        }

        String[] vr1=version1.split("\\.");

        String[] vr2=version2.split("\\.");

        int i=0;

        while(i<vr1.length || i<vr2.length)

        { 

            int a=0,b=0;

            if(i<vr1.length)

                a=Integer.valueOf(vr1[i]);

            if(i<vr2.length)

                b=Integer.valueOf(vr2[i]);

            if(a<b)

                return -1;

                else if(a>b)

                    return 1;

            i++;

        }

        return 0;

                

        

    }

}
