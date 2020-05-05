package com.prog.pattern.example.correct.impl.v5.factory.card.amex;

import com.prog.pattern.example.correct.impl.v5.factory.card.CreditCard;
import com.prog.pattern.example.correct.impl.v5.factory.card.Validator;

public class AmexPlatinumValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		
		return false;
	}

}
