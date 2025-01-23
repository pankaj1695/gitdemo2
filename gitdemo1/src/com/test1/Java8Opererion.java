package com.test1;

import java.security.DomainCombiner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Java8Opererion {
public static void main(String[] args) {
	String str="krishnarajpura";
	String sortstr=Arrays.stream(str.split("")).sorted().collect(Collectors.joining());
	System.out.println(sortstr);
	String remstr=Arrays.stream(str.split("")).distinct().collect(Collectors.joining());
	System.out.println(remstr);
}
}
