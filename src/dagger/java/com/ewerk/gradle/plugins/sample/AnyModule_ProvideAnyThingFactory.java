package com.ewerk.gradle.plugins.sample;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class AnyModule_ProvideAnyThingFactory implements Factory<AnyThing> {
  private final AnyModule module;

  public AnyModule_ProvideAnyThingFactory(AnyModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public AnyThing get() {  
    AnyThing provided = module.provideAnyThing();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<AnyThing> create(AnyModule module) {  
    return new AnyModule_ProvideAnyThingFactory(module);
  }
}

