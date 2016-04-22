/*
 * Copyright 2012-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ewerk.gradle.plugins.sample;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class SampleTest {

  @Test
  public void testConstruct() {
    Sample sample = new Sample();
    Bean bean = sample.construct();
    assertThat(bean.hello()).isEqualTo("This is just a String!");
    assertThat(bean.count()).isEqualTo(10);
  }
}