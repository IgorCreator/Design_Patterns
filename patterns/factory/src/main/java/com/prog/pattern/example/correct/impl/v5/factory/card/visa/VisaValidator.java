package com.prog.pattern.example.correct.impl.v5.factory.card.visa;

import com.prog.pattern.example.correct.impl.v5.factory.card.CreditCard;
import com.prog.pattern.example.correct.impl.v5.factory.card.Validator;

public class VisaValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		// method stub
		return false;
	}

}
