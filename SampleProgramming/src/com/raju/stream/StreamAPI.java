package com.raju.stream;

import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		Stream<Integer> streamList = Stream.of(9,5,2,6,8,4,1,3,7);
		streamList.skip(3).limit(9).forEach(System.out::println);
		
		System.out.println("________________");
		
		Stream<Integer> list = Stream.iterate(1, n->n+4);
		list.skip(0).limit(50).forEach(System.out::println);

	}

}
