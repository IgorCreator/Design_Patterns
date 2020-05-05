package com.prog.pattern.example.correct.impl.v5.factory.card;

import com.prog.pattern.example.correct.impl.v5.factory.card.amex.AmexFactory;
import com.prog.pattern.example.correct.impl.v5.factory.card.visa.VisaFactory;

//AbstractFactory
public abstract class CreditCardFactory {

	public static CreditCardFactory getCreditCardFactory(int creditScore) {
	
		if(creditScore > 650) {
			return new AmexFactory();
		}
		else {
			return new VisaFactory();
		}
	}
	
	public abstract CreditCard getCreditCard(CardType cardType);
		
	public abstract Validator getValidator(CardType cardType);
}
