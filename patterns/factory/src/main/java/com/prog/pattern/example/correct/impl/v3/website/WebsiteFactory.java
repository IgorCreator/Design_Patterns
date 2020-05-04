package com.prog.pattern.example.correct.impl.v3.website;

import com.prog.pattern.example.correct.impl.v3.website.blog.Blog;
import com.prog.pattern.example.correct.impl.v3.website.shop.Shop;

public class WebsiteFactory {

	public static Website getWebsite(WebsiteType siteType) {
		switch(siteType) {
			case BLOG : {
				return new Blog();
			}
			case SHOP : {
				return new Shop();
			}
			default : {
				return null;
			}
 		}
	}
	
}
