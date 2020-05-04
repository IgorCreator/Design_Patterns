package com.prog.pattern.example.correct.impl.v3.website.shop;

import com.prog.pattern.example.correct.impl.v3.website.Website;
import com.prog.pattern.example.correct.impl.v3.website.pages.CartPage;
import com.prog.pattern.example.correct.impl.v3.website.pages.ItemPage;
import com.prog.pattern.example.correct.impl.v3.website.pages.SearchPage;

public class Shop extends Website {

	@Override
	public void createWebsite() {
		pages.add(new CartPage());
		pages.add(new ItemPage());
		pages.add(new SearchPage());
	}

}
