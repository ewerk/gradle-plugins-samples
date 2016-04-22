package com.ewerk.gradle.plugins.sample;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AnyModule_ProvideAnyThingFactory implements Factory<AnyThing> {
  private final AnyModule module;

  public AnyModule_ProvideAnyThingFactory(AnyModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public AnyThing get() {
    return Preconditions.checkNotNull(
        module.provideAnyThing(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<AnyThing> create(AnyModule module) {
    return new AnyModule_ProvideAnyThingFactory(module);
  }
}
