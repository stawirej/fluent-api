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
package io.github.stawirej.fluentapi.prepositions.complex;

/**
 * Represents an operation that accepts a single input argument, returns no result and substitutes 'accordingTo' word.
 *
 * @param <T> the type of the input to the operation
 * @author Piotr Stawirej
 */
@FunctionalInterface
public interface AccordingToConsumer<T> {

    /**
     * Performs this operation on the given argument.
     *
     * @param t the input argument
     */
    void accordingTo(T t);
}
