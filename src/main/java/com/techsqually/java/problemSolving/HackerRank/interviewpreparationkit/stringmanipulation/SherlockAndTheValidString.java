package com.techsqually.java.problemSolving.HackerRank.interviewpreparationkit.stringmanipulation;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.techsqually.java.datastructure.collections.sets.hashset.Itterator;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

interface Funtion{

    int sum(int n);
}

public class SherlockAndTheValidString {
    public static HashMap<Character,Integer> charMap = new HashMap<>();
    public static int sum = 0;


    public static void main(String[] args) {

   /*     System.out.println(isValid("aabbccddeefghi"));
        System.out.println(isValid("abcdefghhgfedecba"));
        System.out.println(isValid("aac"));
        System.out.println(isValid("aacc"));
        System.out.println(isValid("aabbc"));*/
        System.out.println(isValid("aaaabbcc"));
//        System.out.println(isValid("ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd"));
//        System.out.println(isValid("ebhcgicceggecgdcibbeicigehhebabiehbdgaeaigihghbhigihfebgabicbgfhhedgbfehiahchcecedffhccebifcbdfcfaecicafahfiecceeaabbecfhgbfifabbffadcieeaiidddhfdeccaedbgcfdehbadihheieidgcfbdiiicgahebfbbdfeffegbdhgdagefhbgafaabfghdcbfdhabhfahbdhgifbghhafcieachcbeabccbiigdcfegcccfafehegbiecbdhabcffggiifaabfagbfdfbfacdcafabccgibiidgabiabigbgbbaideeagaaffcddhieicehhchfedfgbgbfhgedhacegaieeedggacbbgadeibbbcdhbabbieibcfbhgdbbiecdhbffaghhchhddcihgdgbgdcfgfggeaahffgiddeadgcegaiddhhdgagdidgacafececiebeigcbdfaedibbgbhciihcdifbacdagfbcefifefchhddadeaiegbfaidbeebiefghfghhdabdeegabagfbbdgbeaiiigeaadhbgebedddfihagdeiccdbcfchgadhgfaidaebfabbagdghebgagbfhfbgeagdgecbhfchebdgafceaffabagedbhcgcedaecdbiifefchcbgfbbibhiahchhfadffeacfbgeigaccedadaafhcieficdfhfheibfdhbgbfhhdfcghabacggchchbdaigbcihhdbifcdeggicgacehebadbdaibhdciefdgfhfeggdhgcaeeeidfebbaicgagcaiachffhadbddhhdbcehciagfdgeadidfcaaiafeadefbbbaidgiagbeacchbdaifgccgcfigefcachiiggbghfhbifciafgfigaabidhdgffcbgicbidibacbgfhddafbegdaagbhddceeifecciddigfiehdbdabahgaechffidebhicfcciahhchebdbei"));
    }

    // Complete the isValid function below.
    static String isValid(String s) {

        String result = "NO";
        s.chars().mapToObj(c -> (char)c).forEach(c -> {
            int value = charMap.containsKey(c) ? charMap.get(c)+1 : 1;
            charMap.put(c,value);
        });

        HashMap<Character,Integer> mutableHashMap = new HashMap<>();
        mutableHashMap.putAll(charMap);
        charMap.clear();
        System.out.println(mutableHashMap);


        List<Integer> valuesList = mutableHashMap.values().stream().collect(Collectors.toList());
        HashSet<Integer> valuesSet = new HashSet<>();
        valuesSet.addAll(valuesList);


        if (valuesSet.size() == 1){
            result = "YES";
        }else if(valuesSet.size() == 2) {

            Iterator<Integer> abc = valuesSet.iterator();
            int firstNumber = abc.next();
            int secondNumber = abc.next();



            if (Collections.frequency(valuesList,firstNumber) == 1 || Collections.frequency(valuesList,secondNumber) == 1){
                result = "YES";
            }


        }




            return result;
        }


}
