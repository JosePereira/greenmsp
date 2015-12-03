
package gram.i.types;


public abstract class ExpectedAssert extends gram.i.iAbstractType  {
  /**
   * Sole constructor.  (For invocation by subclass
   * constructors, typically implicit.)
   */
  protected ExpectedAssert() {}



  /**
   * Returns true if the term is rooted by the symbol ConsExpAssert
   *
   * @return true if the term is rooted by the symbol ConsExpAssert
   */
  public boolean isConsExpAssert() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol EmptyExpAssert
   *
   * @return true if the term is rooted by the symbol EmptyExpAssert
   */
  public boolean isEmptyExpAssert() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol ExpectedArgInt
   *
   * @return true if the term is rooted by the symbol ExpectedArgInt
   */
  public boolean isExpectedArgInt() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol ExpectedArgChar
   *
   * @return true if the term is rooted by the symbol ExpectedArgChar
   */
  public boolean isExpectedArgChar() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol ExpectedArgBool
   *
   * @return true if the term is rooted by the symbol ExpectedArgBool
   */
  public boolean isExpectedArgBool() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol ExpectedArgComp
   *
   * @return true if the term is rooted by the symbol ExpectedArgComp
   */
  public boolean isExpectedArgComp() {
    return false;
  }

  /**
   * Returns the subterm corresponding to the slot CompAssert
   *
   * @return the subterm corresponding to the slot CompAssert
   */
  public String getCompAssert() {
    throw new UnsupportedOperationException("This ExpectedAssert has no CompAssert");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot CompAssert
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot CompAssert is replaced by _arg
   */
  public ExpectedAssert setCompAssert(String _arg) {
    throw new UnsupportedOperationException("This ExpectedAssert has no CompAssert");
  }

  /**
   * Returns the subterm corresponding to the slot BoolAssert
   *
   * @return the subterm corresponding to the slot BoolAssert
   */
  public String getBoolAssert() {
    throw new UnsupportedOperationException("This ExpectedAssert has no BoolAssert");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot BoolAssert
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot BoolAssert is replaced by _arg
   */
  public ExpectedAssert setBoolAssert(String _arg) {
    throw new UnsupportedOperationException("This ExpectedAssert has no BoolAssert");
  }

  /**
   * Returns the subterm corresponding to the slot Char
   *
   * @return the subterm corresponding to the slot Char
   */
  public String getChar() {
    throw new UnsupportedOperationException("This ExpectedAssert has no Char");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot Char
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot Char is replaced by _arg
   */
  public ExpectedAssert setChar(String _arg) {
    throw new UnsupportedOperationException("This ExpectedAssert has no Char");
  }

  /**
   * Returns the subterm corresponding to the slot Int
   *
   * @return the subterm corresponding to the slot Int
   */
  public int getInt() {
    throw new UnsupportedOperationException("This ExpectedAssert has no Int");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot Int
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot Int is replaced by _arg
   */
  public ExpectedAssert setInt(int _arg) {
    throw new UnsupportedOperationException("This ExpectedAssert has no Int");
  }

  /**
   * Returns the subterm corresponding to the slot HeadExpAssert
   *
   * @return the subterm corresponding to the slot HeadExpAssert
   */
  public gram.i.types.ExpectedAssert getHeadExpAssert() {
    throw new UnsupportedOperationException("This ExpectedAssert has no HeadExpAssert");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot HeadExpAssert
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot HeadExpAssert is replaced by _arg
   */
  public ExpectedAssert setHeadExpAssert(gram.i.types.ExpectedAssert _arg) {
    throw new UnsupportedOperationException("This ExpectedAssert has no HeadExpAssert");
  }

  /**
   * Returns the subterm corresponding to the slot TailExpAssert
   *
   * @return the subterm corresponding to the slot TailExpAssert
   */
  public gram.i.types.ExpectedAssert getTailExpAssert() {
    throw new UnsupportedOperationException("This ExpectedAssert has no TailExpAssert");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot TailExpAssert
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot TailExpAssert is replaced by _arg
   */
  public ExpectedAssert setTailExpAssert(gram.i.types.ExpectedAssert _arg) {
    throw new UnsupportedOperationException("This ExpectedAssert has no TailExpAssert");
  }

  protected static tom.library.utils.IdConverter idConv = new tom.library.utils.IdConverter();

  /**
   * Returns an ATerm representation of this term.
   *
   * @return null to indicate to sub-classes that they have to work
   */
  public aterm.ATerm toATerm() {
    // returns null to indicate sub-classes that they have to work
    return null;
  }

  /**
   * Returns a gram.i.types.ExpectedAssert from an ATerm without any conversion
   *
   * @param trm ATerm to handle to retrieve a Gom term
   * @return the term from the ATerm
   */
  public static gram.i.types.ExpectedAssert fromTerm(aterm.ATerm trm) {
    return fromTerm(trm,idConv);
  }

  /**
   * Returns a gram.i.types.ExpectedAssert from a String without any conversion
   *
   * @param s String containing the ATerm
   * @return the term from the String
   */
  public static gram.i.types.ExpectedAssert fromString(String s) {
    return fromTerm(atermFactory.parse(s),idConv);
  }

  /**
   * Returns a gram.i.types.ExpectedAssert from a Stream without any conversion
   *
   * @param stream stream containing the ATerm
   * @return the term from the Stream
   * @throws java.io.IOException if a problem occurs with the stream
   */
  public static gram.i.types.ExpectedAssert fromStream(java.io.InputStream stream) throws java.io.IOException {
    return fromTerm(atermFactory.readFromFile(stream),idConv);
  }

  /**
   * Apply a conversion on the ATerm and returns a gram.i.types.ExpectedAssert
   *
   * @param trm ATerm to convert into a Gom term
   * @param atConv ATermConverter used to convert the ATerm
   * @return the Gom term
   * @throws IllegalArgumentException
   */
  public static gram.i.types.ExpectedAssert fromTerm(aterm.ATerm trm, tom.library.utils.ATermConverter atConv) {
    aterm.ATerm convertedTerm = atConv.convert(trm);
    gram.i.types.ExpectedAssert tmp;
    java.util.ArrayList<gram.i.types.ExpectedAssert> results = new java.util.ArrayList<gram.i.types.ExpectedAssert>();

    tmp = gram.i.types.expectedassert.ConsExpAssert.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = gram.i.types.expectedassert.EmptyExpAssert.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = gram.i.types.expectedassert.ExpectedArgInt.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = gram.i.types.expectedassert.ExpectedArgChar.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = gram.i.types.expectedassert.ExpectedArgBool.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = gram.i.types.expectedassert.ExpectedArgComp.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = gram.i.types.expectedassert.ExpAssert.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    switch(results.size()) {
      case 0:
        throw new IllegalArgumentException(trm + " is not a ExpectedAssert");
      case 1:
        return results.get(0);
      default:
        java.util.logging.Logger.getLogger("ExpectedAssert").log(java.util.logging.Level.WARNING,"There were many possibilities ({0}) in {1} but the first one was chosen: {2}",new Object[] {results.toString(), "gram.i.types.ExpectedAssert", results.get(0).toString()});
        return results.get(0);
    }
  }

  /**
   * Apply a conversion on the ATerm contained in the String and returns a gram.i.types.ExpectedAssert from it
   *
   * @param s String containing the ATerm
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static gram.i.types.ExpectedAssert fromString(String s, tom.library.utils.ATermConverter atConv) {
    return fromTerm(atermFactory.parse(s),atConv);
  }

  /**
   * Apply a conversion on the ATerm contained in the Stream and returns a gram.i.types.ExpectedAssert from it
   *
   * @param stream stream containing the ATerm
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static gram.i.types.ExpectedAssert fromStream(java.io.InputStream stream, tom.library.utils.ATermConverter atConv) throws java.io.IOException {
    return fromTerm(atermFactory.readFromFile(stream),atConv);
  }

  /**
   * Returns the length of the list
   *
   * @return the length of the list
   * @throws IllegalArgumentException if the term is not a list
   */
  public int length() {
    throw new IllegalArgumentException(
      "This "+this.getClass().getName()+" is not a list");
  }

  /**
   * Returns an inverted term
   *
   * @return the inverted list
   * @throws IllegalArgumentException if the term is not a list
   */
  public gram.i.types.ExpectedAssert reverse() {
    throw new IllegalArgumentException(
      "This "+this.getClass().getName()+" is not a list");
  }

  
  /**
   * Returns a Collection extracted from the term
   *
   * @return the collection
   * @throws UnsupportedOperationException if the term is not a list
   */
  public java.util.Collection<gram.i.types.ExpectedAssert> getCollectionExpAssert() {
    throw new UnsupportedOperationException("This ExpectedAssert cannot be converted into a Collection");
  }
          
  /*
   * Initialize the (cyclic) data-structure
   * in order to generate/enumerate terms
   */

  protected static tom.library.enumerator.Enumeration<gram.i.types.ExpectedAssert> enumExpectedAssert = null;
  public static final tom.library.enumerator.Enumeration<gram.i.types.ExpectedAssert> tmpenumExpectedAssert = new tom.library.enumerator.Enumeration<gram.i.types.ExpectedAssert>((tom.library.enumerator.LazyList<tom.library.enumerator.Finite<gram.i.types.ExpectedAssert>>) null);

  public static tom.library.enumerator.Enumeration<gram.i.types.ExpectedAssert> getEnumeration() {
    if(enumExpectedAssert == null) { 
      enumExpectedAssert = gram.i.types.expectedassert.ExpectedArgInt.funMake().apply(tom.library.enumerator.Combinators.makeint())
        .plus(gram.i.types.expectedassert.ExpectedArgChar.funMake().apply(tom.library.enumerator.Combinators.makeString()))
        .plus(gram.i.types.expectedassert.ExpectedArgBool.funMake().apply(tom.library.enumerator.Combinators.makeString()))
        .plus(gram.i.types.expectedassert.ExpectedArgComp.funMake().apply(tom.library.enumerator.Combinators.makeString()).apply(tom.library.enumerator.Combinators.makeint()));


      tmpenumExpectedAssert.p1 = new tom.library.enumerator.P1<tom.library.enumerator.LazyList<tom.library.enumerator.Finite<gram.i.types.ExpectedAssert>>>() {
        public tom.library.enumerator.LazyList<tom.library.enumerator.Finite<gram.i.types.ExpectedAssert>> _1() { return enumExpectedAssert.parts(); }
      };

    }
    return enumExpectedAssert;
  }

}
