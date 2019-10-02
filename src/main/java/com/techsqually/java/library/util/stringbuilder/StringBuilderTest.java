package com.techsqually.java.library.util.stringbuilder;

public class StringBuilderTest {


    public static void main(String[] args) {

        /**
         * appand() supports -> string, char,boolean , char[], int , float, double. long, CharSequence
         *                      StringBuffer,
         * reverse() -> it reverse the given string e.g arpan will be reversed to napra
         *
         * delete(int start, int end) ->
         *
         *
         * */

        StringBuilder stringBuilder = new StringBuilder("hello");

        /**@return : hello*/
        System.out.println(stringBuilder.toString());


        /** @return : helloARPAN , givenString = hello*/
        System.out.println(stringBuilder.append(new char[]{'A', 'R', 'P', 'A', 'N'}).toString());

        /** @return : helloARPANtrue , givenString = helloARPAN */
        System.out.println(stringBuilder.append(true));


        /** @return : eurtNAPRAolleh , givenString = helloARPANtrue*/
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder.reverse());

        /**@return: index of string started from true ,
         *           if givenString=hellotrueARPANtrue
         *  lastIndexOf("true") :
         *           -> returns the index from where true start from the last
         *           index starts from 0, in our case it returns 14 , while true starts from 11 character
         *  lastIndexOf("string", int fromIndex)
         *
         *           insert(offset,char/string/char[]/double/long/CharSequence,StringBuffer)
         *           Note: index starts from 0, while offset starts from 1, so it will
         *           insert the string after 5th character or we can say after index 4
         *          System.out.println(stringBuilder.insert(5,"true"));
         * */
        System.out.println(stringBuilder.insert(5, "true"));
        System.out.println(stringBuilder.lastIndexOf("true"));


        /**
         *  deleteCharAt(index) ->
         *           givenString : hellotrueARPANtrue
         *           returns : hellotrueARPANtru
         *
         *
         *
         * */

        System.out.println(stringBuilder.deleteCharAt(stringBuilder.toString().length() - 1));

        /**
         *  delete(int startIndexInclusive,int endIndexExclusive) ->
         *                    givenString : hellotrueARPANtru
         *                    returns : hellotrueARPAN
         * */
        System.out.println(stringBuilder.delete(stringBuilder.toString().length() - 3, stringBuilder.length()));

        /**
         * replace(int startIndexInclusive, int endIndexExclusive, "stringToBeReplacedWith")
         * */
        System.out.println(stringBuilder.replace(9, stringBuilder.length(), "arpan"));

        /**@return : hellotrueFALSEarpan, given = hellotruearpan  */
        System.out.println(stringBuilder.insert(stringBuilder.length() - 5, new char[]{'F', 'A', 'L', 'S', 'E', 'T', 'E'}, 0, 5));


        /** lamda funtion on string builder*/
        stringBuilder.chars().forEach(i -> {
            System.out.println((char) i);
        });

    }
}
