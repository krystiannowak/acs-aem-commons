/*
 * ACS AEM Commons
 *
 * Copyright (C) 2013 - 2023 Adobe
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

package com.adobe.acs.commons.analysis.jcrchecksum.impl.options;

import com.adobe.acs.commons.analysis.jcrchecksum.ChecksumGeneratorOptions;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;

import java.io.IOException;

public class ChecksumGeneratorOptionsFactory {

    private ChecksumGeneratorOptionsFactory() {
        // Private cstor
    }

    public static ChecksumGeneratorOptions getOptions(SlingHttpServletRequest request, String name) throws IOException {
        if (StringUtils.equalsIgnoreCase("REQUEST", name)) {
            return new RequestChecksumGeneratorOptions(request);
        } else {
            return new DefaultChecksumGeneratorOptions(request);
        }
    }
}
