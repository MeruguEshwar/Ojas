package com.ojas.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component(value = "media")
public class MediaTracker implements MobileProcessor {

	@Override
	public void process() {
		System.out.println("2nd best cpu");
	}

}
