/*package org.ss;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sd {
@RequestMapping("/hello")
public List<Topic> fn()
{
	return Arrays.asList(new Topic("ankush",1),new Topic("ankit",2));
}
}
*/
package org.ss;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sd {
	@Autowired
	private xy x;
@RequestMapping("/hello")


public List<Topic> fn()
{
	return x.fn2();
}
}
