package com.ewerk.gradle.plugins.sample;

import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
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

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideAnyThingProvider = AnyModule_ProvideAnyThingFactory.create(builder.anyModule);
  }

  @Override
  public AnyThing thing() {
    return provideAnyThingProvider.get();
  }

  public static final class Builder {
    private AnyModule anyModule;

    private Builder() {}

    public AnyComponent build() {
      if (anyModule == null) {
        this.anyModule = new AnyModule();
      }
      return new DaggerAnyComponent(this);
    }

    public Builder anyModule(AnyModule anyModule) {
      this.anyModule = Preconditions.checkNotNull(anyModule);
      return this;
    }
  }
}
