package org.ss;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class BusinessService {
	List<Topic> topic= Arrays.asList(new Topic("ankush",1),new Topic("ankit",2));

	public List<Topic> fn2()
	{
		return Arrays.asList(new Topic("ankush",1),new Topic("ankit",2));
	}
}
