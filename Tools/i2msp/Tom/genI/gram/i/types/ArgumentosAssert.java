
package gram.i.types;


public abstract class ArgumentosAssert extends gram.i.iAbstractType  {
  /**
   * Sole constructor.  (For invocation by subclass
   * constructors, typically implicit.)
   */
  protected ArgumentosAssert() {}



  /**
   * Returns true if the term is rooted by the symbol ConsListaArgsAssert
   *
   * @return true if the term is rooted by the symbol ConsListaArgsAssert
   */
  public boolean isConsListaArgsAssert() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol EmptyListaArgsAssert
   *
   * @return true if the term is rooted by the symbol EmptyListaArgsAssert
   */
  public boolean isEmptyListaArgsAssert() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol ArgumentoAssertInt
   *
   * @return true if the term is rooted by the symbol ArgumentoAssertInt
   */
  public boolean isArgumentoAssertInt() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol ArgumentoAssertChar
   *
   * @return true if the term is rooted by the symbol ArgumentoAssertChar
   */
  public boolean isArgumentoAssertChar() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol ArgumentoAssertBool
   *
   * @return true if the term is rooted by the symbol ArgumentoAssertBool
   */
  public boolean isArgumentoAssertBool() {
    return false;
  }

  /**
   * Returns the subterm corresponding to the slot TailListaArgsAssert
   *
   * @return the subterm corresponding to the slot TailListaArgsAssert
   */
  public gram.i.types.ArgumentosAssert getTailListaArgsAssert() {
    throw new UnsupportedOperationException("This ArgumentosAssert has no TailListaArgsAssert");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot TailListaArgsAssert
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot TailListaArgsAssert is replaced by _arg
   */
  public ArgumentosAssert setTailListaArgsAssert(gram.i.types.ArgumentosAssert _arg) {
    throw new UnsupportedOperationException("This ArgumentosAssert has no TailListaArgsAssert");
  }

  /**
   * Returns the subterm corresponding to the slot BoolAssert
   *
   * @return the subterm corresponding to the slot BoolAssert
   */
  public String getBoolAssert() {
    throw new UnsupportedOperationException("This ArgumentosAssert has no BoolAssert");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot BoolAssert
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot BoolAssert is replaced by _arg
   */
  public ArgumentosAssert setBoolAssert(String _arg) {
    throw new UnsupportedOperationException("This ArgumentosAssert has no BoolAssert");
  }

  /**
   * Returns the subterm corresponding to the slot Char
   *
   * @return the subterm corresponding to the slot Char
   */
  public String getChar() {
    throw new UnsupportedOperationException("This ArgumentosAssert has no Char");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot Char
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot Char is replaced by _arg
   */
  public ArgumentosAssert setChar(String _arg) {
    throw new UnsupportedOperationException("This ArgumentosAssert has no Char");
  }

  /**
   * Returns the subterm corresponding to the slot Int
   *
   * @return the subterm corresponding to the slot Int
   */
  public int getInt() {
    throw new UnsupportedOperationException("This ArgumentosAssert has no Int");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot Int
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot Int is replaced by _arg
   */
  public ArgumentosAssert setInt(int _arg) {
    throw new UnsupportedOperationException("This ArgumentosAssert has no Int");
  }

  /**
   * Returns the subterm corresponding to the slot HeadListaArgsAssert
   *
   * @return the subterm corresponding to the slot HeadListaArgsAssert
   */
  public gram.i.types.ArgumentosAssert getHeadListaArgsAssert() {
    throw new UnsupportedOperationException("This ArgumentosAssert has no HeadListaArgsAssert");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot HeadListaArgsAssert
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot HeadListaArgsAssert is replaced by _arg
   */
  public ArgumentosAssert setHeadListaArgsAssert(gram.i.types.ArgumentosAssert _arg) {
    throw new UnsupportedOperationException("This ArgumentosAssert has no HeadListaArgsAssert");
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
   * Returns a gram.i.types.ArgumentosAssert from an ATerm without any conversion
   *
   * @param trm ATerm to handle to retrieve a Gom term
   * @return the term from the ATerm
   */
  public static gram.i.types.ArgumentosAssert fromTerm(aterm.ATerm trm) {
    return fromTerm(trm,idConv);
  }

  /**
   * Returns a gram.i.types.ArgumentosAssert from a String without any conversion
   *
   * @param s String containing the ATerm
   * @return the term from the String
   */
  public static gram.i.types.ArgumentosAssert fromString(String s) {
    return fromTerm(atermFactory.parse(s),idConv);
  }

  /**
   * Returns a gram.i.types.ArgumentosAssert from a Stream without any conversion
   *
   * @param stream stream containing the ATerm
   * @return the term from the Stream
   * @throws java.io.IOException if a problem occurs with the stream
   */
  public static gram.i.types.ArgumentosAssert fromStream(java.io.InputStream stream) throws java.io.IOException {
    return fromTerm(atermFactory.readFromFile(stream),idConv);
  }

  /**
   * Apply a conversion on the ATerm and returns a gram.i.types.ArgumentosAssert
   *
   * @param trm ATerm to convert into a Gom term
   * @param atConv ATermConverter used to convert the ATerm
   * @return the Gom term
   * @throws IllegalArgumentException
   */
  public static gram.i.types.ArgumentosAssert fromTerm(aterm.ATerm trm, tom.library.utils.ATermConverter atConv) {
    aterm.ATerm convertedTerm = atConv.convert(trm);
    gram.i.types.ArgumentosAssert tmp;
    java.util.ArrayList<gram.i.types.ArgumentosAssert> results = new java.util.ArrayList<gram.i.types.ArgumentosAssert>();

    tmp = gram.i.types.argumentosassert.ConsListaArgsAssert.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = gram.i.types.argumentosassert.EmptyListaArgsAssert.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = gram.i.types.argumentosassert.ArgumentoAssertInt.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = gram.i.types.argumentosassert.ArgumentoAssertChar.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = gram.i.types.argumentosassert.ArgumentoAssertBool.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = gram.i.types.argumentosassert.ListaArgsAssert.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    switch(results.size()) {
      case 0:
        throw new IllegalArgumentException(trm + " is not a ArgumentosAssert");
      case 1:
        return results.get(0);
      default:
        java.util.logging.Logger.getLogger("ArgumentosAssert").log(java.util.logging.Level.WARNING,"There were many possibilities ({0}) in {1} but the first one was chosen: {2}",new Object[] {results.toString(), "gram.i.types.ArgumentosAssert", results.get(0).toString()});
        return results.get(0);
    }
  }

  /**
   * Apply a conversion on the ATerm contained in the String and returns a gram.i.types.ArgumentosAssert from it
   *
   * @param s String containing the ATerm
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static gram.i.types.ArgumentosAssert fromString(String s, tom.library.utils.ATermConverter atConv) {
    return fromTerm(atermFactory.parse(s),atConv);
  }

  /**
   * Apply a conversion on the ATerm contained in the Stream and returns a gram.i.types.ArgumentosAssert from it
   *
   * @param stream stream containing the ATerm
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static gram.i.types.ArgumentosAssert fromStream(java.io.InputStream stream, tom.library.utils.ATermConverter atConv) throws java.io.IOException {
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
  public gram.i.types.ArgumentosAssert reverse() {
    throw new IllegalArgumentException(
      "This "+this.getClass().getName()+" is not a list");
  }

  
  /**
   * Returns a Collection extracted from the term
   *
   * @return the collection
   * @throws UnsupportedOperationException if the term is not a list
   */
  public java.util.Collection<gram.i.types.ArgumentosAssert> getCollectionListaArgsAssert() {
    throw new UnsupportedOperationException("This ArgumentosAssert cannot be converted into a Collection");
  }
          
  /*
   * Initialize the (cyclic) data-structure
   * in order to generate/enumerate terms
   */

  protected static tom.library.enumerator.Enumeration<gram.i.types.ArgumentosAssert> enumArgumentosAssert = null;
  public static final tom.library.enumerator.Enumeration<gram.i.types.ArgumentosAssert> tmpenumArgumentosAssert = new tom.library.enumerator.Enumeration<gram.i.types.ArgumentosAssert>((tom.library.enumerator.LazyList<tom.library.enumerator.Finite<gram.i.types.ArgumentosAssert>>) null);

  public static tom.library.enumerator.Enumeration<gram.i.types.ArgumentosAssert> getEnumeration() {
    if(enumArgumentosAssert == null) { 
      enumArgumentosAssert = gram.i.types.argumentosassert.ArgumentoAssertInt.funMake().apply(tom.library.enumerator.Combinators.makeint())
        .plus(gram.i.types.argumentosassert.ArgumentoAssertChar.funMake().apply(tom.library.enumerator.Combinators.makeString()))
        .plus(gram.i.types.argumentosassert.ArgumentoAssertBool.funMake().apply(tom.library.enumerator.Combinators.makeString()));


      tmpenumArgumentosAssert.p1 = new tom.library.enumerator.P1<tom.library.enumerator.LazyList<tom.library.enumerator.Finite<gram.i.types.ArgumentosAssert>>>() {
        public tom.library.enumerator.LazyList<tom.library.enumerator.Finite<gram.i.types.ArgumentosAssert>> _1() { return enumArgumentosAssert.parts(); }
      };

    }
    return enumArgumentosAssert;
  }

}
