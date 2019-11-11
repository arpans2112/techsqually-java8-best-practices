package com.techsqually.java.datastructure.collections.maps.hashmap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Person{
 int getId;
 int getValue;

      Person(int getId , int getValue){

          this.getId = getId;
          this.getValue = getValue;
      }

    public int getGetId() {
        return getId;
    }



    public int getGetValue() {
        return getValue;
    }

}

public class CollectorsToMapExample {

    public static void main(String[] args) {

        List<Person> personsList = new ArrayList<>();
        personsList.add(new Person(1,673523));
        personsList.add(new Person(1,673523));
        personsList.add(new Person(2,673525));
        personsList.add(new Person(3,673525));



      Map<Integer,Integer> map =  personsList.stream().collect(Collectors.toMap(Person::getGetId,Person::getGetValue));
      System.out.println(map);

    }
}
