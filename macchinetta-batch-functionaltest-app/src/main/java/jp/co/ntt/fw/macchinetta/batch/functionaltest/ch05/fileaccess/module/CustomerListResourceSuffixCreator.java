/*
 * Copyright (C) 2018 NTT Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package jp.co.ntt.fw.macchinetta.batch.functionaltest.ch05.fileaccess.module;

import org.springframework.batch.item.file.ResourceSuffixCreator;

/**
 * ResourceSuffixCreator that generate unique filename of customer list.
 *
 * @since 5.0.0
 */
public class CustomerListResourceSuffixCreator implements ResourceSuffixCreator {
    @Override
    public String getSuffix(int index) {
        return String.format("%02d", index) + ".csv";
    }
}
