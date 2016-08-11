package codechallenges.programerinterview;

/**
 * Created by JacksonChang408 on 8/10/2016.
 */
public class Permutation {
    /*
    void permute( String input)
    {
        int inputLength = input.length();
        boolean[ ] used = new boolean[ inputLength ];
        StringBuffer outputString = new StringBuffer();
        char[ ] in = input.toCharArray( );

        doPermute ( in, outputString, used, inputLength, 0 );

    }

    void doPermute ( char[ ] in, StringBuffer outputString,
                     boolean[ ] used, int inputLength, int level)
    {
        if( level == inputLength) {
            System.out.println ( outputString.toString());
            return;
        }

        for( int i = 0; i < inputLength; ++i )
        {

            if( used[i] ) continue;

            outputString.append( in[i] );
            used[i] = true;
            doPermute( in,   outputString, used, inputLength, level + 1 );
            used[i] = false;
            outputString.setLength(   outputString.length() - 1 );
        }
    }*/


    public static void permutation(String str) {
        permutation("", str);
    }

    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0)
            System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }
    public static void main(String [] args){
        Permutation.permutation("ABCDE");
        System.out.println("ABC".substring(0,0));
        System.out.println("ABC".substring(1,3));
    }
}
