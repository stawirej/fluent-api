/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.stawirej.fluentapi.prepositions.simple;

/**
 * Represents a function that accepts one argument, produces a result and substitutes 'aboard' word.
 *
 * @param <T> the type of the input to the function
 * @param <R> the type of the result of the function
 * @author Piotr Stawirej
 */
@FunctionalInterface
public interface AboardFunction<R, T> {

    /**
     * Applies this function to the given argument.
     *
     * @param t the function argument
     * @return the function result
     */
    R aboard(T t);
}
