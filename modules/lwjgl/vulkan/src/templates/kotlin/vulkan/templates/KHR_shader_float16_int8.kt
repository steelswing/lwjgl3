/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_shader_float16_int8 = "KHRShaderFloat16Int8".nativeClassVK("KHR_shader_float16_int8", type = "device", postfix = KHR) {
    documentation =
        """
        <h5>Description</h5>
        The {@code VK_KHR_shader_float16_int8} extension allows use of 16-bit floating-point types and 8-bit integer types in shaders for arithmetic operations.

        It introduces two new optional features {@code shaderFloat16} and {@code shaderInt8} which directly map to the {@code Float16} and the {@code Int8} SPIR-V capabilities. The {@code VK_KHR_shader_float16_int8} extension also specifies precision requirements for half-precision floating-point SPIR-V operations. This extension does not enable use of 8-bit integer types or 16-bit floating-point types in any <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#interfaces-iointerfaces"> shader input and output interfaces</a> and therefore does not supersede the {@link KHR8bitStorage VK_KHR_8bit_storage} or {@link KHR16bitStorage VK_KHR_16bit_storage} extensions.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_shader_float16_int8}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>83</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Alexander Galazin <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_shader_float16_int8:%20&amp;body=@alegal-arm%20">alegal-arm</a></li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2018-03-07</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension interacts with {@link KHR8bitStorage VK_KHR_8bit_storage}</li>
                <li>This extension interacts with {@link KHR16bitStorage VK_KHR_16bit_storage}</li>
                <li>This extension interacts with {@link KHRShaderFloatControls VK_KHR_shader_float_controls}</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Alexander Galazin, Arm</li>
                <li>Jan-Harald Fredriksen, Arm</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Graeme Leese, Broadcom</li>
                <li>Daniel Rakos, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_SHADER_FLOAT16_INT8_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_SHADER_FLOAT16_INT8_EXTENSION_NAME".."VK_KHR_shader_float16_int8"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FLOAT16_INT8_FEATURES_KHR".."1000082000"
    )
}