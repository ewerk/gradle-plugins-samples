
package com.ewerk.gradle.plugins.sample;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_Bean extends Bean {

  private final String hello;
  private final int count;

  AutoValue_Bean(
      String hello,
      int count) {
    if (hello == null) {
      throw new NullPointerException("Null hello");
    }
    this.hello = hello;
    this.count = count;
  }

  @Override
  String hello() {
    return hello;
  }

  @Override
  int count() {
    return count;
  }

  @Override
  public String toString() {
    return "Bean{"
        + "hello=" + hello + ", "
        + "count=" + count
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Bean) {
      Bean that = (Bean) o;
      return (this.hello.equals(that.hello()))
           && (this.count == that.count());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.hello.hashCode();
    h *= 1000003;
    h ^= this.count;
    return h;
  }

}
