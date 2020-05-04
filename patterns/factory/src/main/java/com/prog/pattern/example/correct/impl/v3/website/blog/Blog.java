package com.prog.pattern.example.correct.impl.v3.website.blog;

import com.prog.pattern.example.correct.impl.v3.website.Website;
import com.prog.pattern.example.correct.impl.v3.website.pages.AboutPage;
import com.prog.pattern.example.correct.impl.v3.website.pages.CommentPage;
import com.prog.pattern.example.correct.impl.v3.website.pages.ContactPage;
import com.prog.pattern.example.correct.impl.v3.website.pages.PostPage;

public class Blog extends Website {

	@Override
	public void createWebsite() {
		pages.add(new PostPage());
		pages.add(new AboutPage());
		pages.add(new CommentPage());
		pages.add(new ContactPage());
	}

}
