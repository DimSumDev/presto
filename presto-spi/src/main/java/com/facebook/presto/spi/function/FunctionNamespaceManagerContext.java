/*
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
package com.facebook.presto.spi.function;

import com.facebook.presto.common.type.TypeManager;
import com.facebook.presto.spi.NodeManager;

import static java.util.Objects.requireNonNull;

public class FunctionNamespaceManagerContext
{
    private final TypeManager typeManager;
    private final NodeManager nodeManager;
    private final FunctionMetadataManager functionMetadataManager;

    public FunctionNamespaceManagerContext(
            TypeManager typeManager,
            NodeManager nodeManager,
            FunctionMetadataManager functionMetadataManager)
    {
        this.typeManager = requireNonNull(typeManager, "typeManager is null");
        this.nodeManager = requireNonNull(nodeManager, "nodeManager is null");
        this.functionMetadataManager = requireNonNull(functionMetadataManager, "functionMetadataManager is null");
    }

    public TypeManager getTypeManager()
    {
        return typeManager;
    }

    public NodeManager getNodeManager()
    {
        return nodeManager;
    }

    public FunctionMetadataManager getFunctionMetadataManager()
    {
        return functionMetadataManager;
    }
}
