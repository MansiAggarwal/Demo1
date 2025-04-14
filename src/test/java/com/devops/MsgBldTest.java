package com.devops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MsgBldTest {
	@Test
	 public void testNameMycov() {
                MsgBld obj = new MsgBld();
                assertEquals("Hello mycov", obj.getMessage("mycov"));
        }
        
        @Test
        public void testNameEmpty() {
                MsgBld obj = new MsgBld();
                assertEquals("Please provide a name!", obj.getMessage(" "));
        }

        @Test
        public void testNameNull() {
                MsgBld obj = new MsgBld();
                assertEquals("Please provide a name!", obj.getMessage(null));
        }
}
