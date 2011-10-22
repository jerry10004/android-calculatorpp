/*
 * Copyright (c) 2009-2011. Created by serso aka se.solovyev.
 * For more information, please, contact se.solovyev@gmail.com
 */

package org.solovyev.android.calculator.math;

import java.util.*;

/**
 * User: serso
 * Date: 9/17/11
 * Time: 10:01 PM
 */
public class Functions {

	// not intended for instantiation
	private Functions() {
		throw new AssertionError("Not allowed!");
	}

	public final static String SIN = "sin";
	public final static String SINH = "sinh";
	public final static String ASIN = "asin";
	public final static String ASINH = "asinh";
	public final static String COS = "cos";
	public final static String COSH = "cosh";
	public final static String ACOS = "acos";
	public final static String ACOSH = "acosh";
	public final static String TAN = "tan";
	public final static String TANH = "tanh";
	public final static String ATAN = "atan";
	public final static String ATANH = "atanh";

	public final static String LN = "ln";
	public final static String LN_JSCL = "log";

	public final static String MOD = "mod";
	public final static String EXP = "exp";

	public final static String SQRT = "√";
	public final static String SQRT_JSCL = "sqrt";

	public static final List<String> allPrefix;

	static {
		final List<String> functions = new ArrayList<String>(Arrays.asList(SIN, SINH, ASIN, ASINH, COS, COSH, ACOS, ACOSH, TAN, TANH, ATAN, ATANH, LN, LN_JSCL, MOD, SQRT, SQRT_JSCL, EXP));
		Collections.sort(functions, new MathEntityComparator());
		allPrefix = functions;
	}

	public final static String FACT = "!";
	public final static String DEGREE = "°";

	public static final List<String> allPostfix = Arrays.asList(FACT, DEGREE);
}