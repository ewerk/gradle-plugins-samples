package com.ewerk.gradle.plugins.sample;

import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerAnyComponent implements AnyComponent {
  private Provider<AnyThing> provideAnyThingProvider;

  private DaggerAnyComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  public static AnyComponent create() {  
    return builder().build();
  }

  private void initialize(final Builder builder) {  
    this.provideAnyThingProvider = AnyModule_ProvideAnyThingFactory.create(builder.anyModule);
  }

  @Override
  public AnyThing thing() {  
    return provideAnyThingProvider.get();
  }

  public static final class Builder {
    private AnyModule anyModule;
  
    private Builder() {  
    }
  
    public AnyComponent build() {  
      if (anyModule == null) {
        this.anyModule = new AnyModule();
      }
      return new DaggerAnyComponent(this);
    }
  
    public Builder anyModule(AnyModule anyModule) {  
      if (anyModule == null) {
        throw new NullPointerException("anyModule");
      }
      this.anyModule = anyModule;
      return this;
    }
  }
}

