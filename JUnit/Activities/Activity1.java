package session1;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Activity1 {

	ArrayList<String> list= new ArrayList<String>();
	
	@BeforeEach
	public void setup() {
		list.add("Alpha");
		list.add("Beta");
	}
	
	@Test
	public void insertTest() {
		Assertions.assertEquals(2,list.size());
		list.add("Gamma");
		Assertions.assertEquals(3, list.size());
		Assertions.assertEquals("Alpha", list.get(0));
		Assertions.assertEquals("Beta", list.get(1));
		Assertions.assertEquals("Gamma", list.get(2));			
	}
	
	@Test
    public void replaceTest() {  
		Assertions.assertEquals(2, list.size());
		list.add("Delta");
        Assertions.assertEquals(3, list.size());
        list.set(1, "charlie");
        Assertions.assertEquals("Alpha", list.get(0));
        Assertions.assertEquals("charlie", list.get(1));
        Assertions.assertEquals("Delta", list.get(2));
    }
}

