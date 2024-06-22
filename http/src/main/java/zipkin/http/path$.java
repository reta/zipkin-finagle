/*
 * Copyright 2016-2024 The OpenZipkin Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package zipkin.http;

import com.twitter.app.Flag;
import com.twitter.app.Flaggable;
import com.twitter.app.JavaGlobalFlag;

public final class path$ extends JavaGlobalFlag<String> {
  public static String DEFAULT_PATH = "/api/v2/spans";

  private path$() {
    super(DEFAULT_PATH,
        "The path to the spans endpoint",
        Flaggable.ofString());
  }

  public static final Flag<String> Flag = new path$();

  public static Flag<?> globalFlagInstance() {
    return Flag;
  }
}

