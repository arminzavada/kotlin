/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.low.level.api.fir.file.structure;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/low-level-api-fir/testData/inBlockModification")
@TestDataPath("$PROJECT_ROOT")
public class OutOfContentRootDanglingFileInBlockModificationTestGenerated extends AbstractOutOfContentRootDanglingFileInBlockModificationTest {
    @Test
    public void testAllFilesPresentInInBlockModification() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/inBlockModification"), Pattern.compile("^(.+)\\.(kt)$"), null, false);
    }

    @Test
    @TestMetadata("contract.kt")
    public void testContract() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/contract.kt");
    }

    @Test
    @TestMetadata("entireContract.kt")
    public void testEntireContract() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/entireContract.kt");
    }

    @Test
    @TestMetadata("entireFunctionBody.kt")
    public void testEntireFunctionBody() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/entireFunctionBody.kt");
    }

    @Test
    @TestMetadata("entireGetterBody.kt")
    public void testEntireGetterBody() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/entireGetterBody.kt");
    }

    @Test
    @TestMetadata("entireInitializer.kt")
    public void testEntireInitializer() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/entireInitializer.kt");
    }

    @Test
    @TestMetadata("entireSetterBody.kt")
    public void testEntireSetterBody() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/entireSetterBody.kt");
    }

    @Test
    @TestMetadata("extensionWithDefaultParameters.kt")
    public void testExtensionWithDefaultParameters() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/extensionWithDefaultParameters.kt");
    }

    @Test
    @TestMetadata("functionWithDefaultParameters.kt")
    public void testFunctionWithDefaultParameters() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/functionWithDefaultParameters.kt");
    }

    @Test
    @TestMetadata("insideContract.kt")
    public void testInsideContract() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/insideContract.kt");
    }

    @Test
    @TestMetadata("insideDefaultParameter.kt")
    public void testInsideDefaultParameter() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/insideDefaultParameter.kt");
    }

    @Test
    @TestMetadata("memberFunWithBodyWithContract.kt")
    public void testMemberFunWithBodyWithContract() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/memberFunWithBodyWithContract.kt");
    }

    @Test
    @TestMetadata("memberFunWithBodyWithErrorContract.kt")
    public void testMemberFunWithBodyWithErrorContract() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/memberFunWithBodyWithErrorContract.kt");
    }

    @Test
    @TestMetadata("memberFunWithBodyWithFakeContract.kt")
    public void testMemberFunWithBodyWithFakeContract() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/memberFunWithBodyWithFakeContract.kt");
    }

    @Test
    @TestMetadata("memberFunWithBodyWithType.kt")
    public void testMemberFunWithBodyWithType() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/memberFunWithBodyWithType.kt");
    }

    @Test
    @TestMetadata("memberFunWithBodyWithoutType.kt")
    public void testMemberFunWithBodyWithoutType() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/memberFunWithBodyWithoutType.kt");
    }

    @Test
    @TestMetadata("memberFunWithBodyWithoutTypeWithoutName.kt")
    public void testMemberFunWithBodyWithoutTypeWithoutName() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/memberFunWithBodyWithoutTypeWithoutName.kt");
    }

    @Test
    @TestMetadata("memberFunWithTypeWithoutBody.kt")
    public void testMemberFunWithTypeWithoutBody() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/memberFunWithTypeWithoutBody.kt");
    }

    @Test
    @TestMetadata("memberFunWithoutBodyWithTypeWithoutName.kt")
    public void testMemberFunWithoutBodyWithTypeWithoutName() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/memberFunWithoutBodyWithTypeWithoutName.kt");
    }

    @Test
    @TestMetadata("memberFunWithoutBodyWithoutTypeWithoutName.kt")
    public void testMemberFunWithoutBodyWithoutTypeWithoutName() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/memberFunWithoutBodyWithoutTypeWithoutName.kt");
    }

    @Test
    @TestMetadata("memberFunWithoutTypeWithoutBody.kt")
    public void testMemberFunWithoutTypeWithoutBody() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/memberFunWithoutTypeWithoutBody.kt");
    }

    @Test
    @TestMetadata("memberGetterWithBodyWithContract.kt")
    public void testMemberGetterWithBodyWithContract() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/memberGetterWithBodyWithContract.kt");
    }

    @Test
    @TestMetadata("memberGetterWithBodyWithContractWithoutName.kt")
    public void testMemberGetterWithBodyWithContractWithoutName() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/memberGetterWithBodyWithContractWithoutName.kt");
    }

    @Test
    @TestMetadata("memberGetterWithTypeWithBody.kt")
    public void testMemberGetterWithTypeWithBody() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/memberGetterWithTypeWithBody.kt");
    }

    @Test
    @TestMetadata("memberGetterWithTypeWithoutBody.kt")
    public void testMemberGetterWithTypeWithoutBody() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/memberGetterWithTypeWithoutBody.kt");
    }

    @Test
    @TestMetadata("memberGetterWithTypeWithoutBodyWithoutName.kt")
    public void testMemberGetterWithTypeWithoutBodyWithoutName() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/memberGetterWithTypeWithoutBodyWithoutName.kt");
    }

    @Test
    @TestMetadata("memberGetterWithoutTypeWithBody.kt")
    public void testMemberGetterWithoutTypeWithBody() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/memberGetterWithoutTypeWithBody.kt");
    }

    @Test
    @TestMetadata("memberGetterWithoutTypeWithoutBody.kt")
    public void testMemberGetterWithoutTypeWithoutBody() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/memberGetterWithoutTypeWithoutBody.kt");
    }

    @Test
    @TestMetadata("memberPropertyWithTypeInDelegate.kt")
    public void testMemberPropertyWithTypeInDelegate() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/memberPropertyWithTypeInDelegate.kt");
    }

    @Test
    @TestMetadata("memberPropertyWithTypeInDelegateWithoutName.kt")
    public void testMemberPropertyWithTypeInDelegateWithoutName() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/memberPropertyWithTypeInDelegateWithoutName.kt");
    }

    @Test
    @TestMetadata("memberPropertyWithTypeInErrorDelegate.kt")
    public void testMemberPropertyWithTypeInErrorDelegate() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/memberPropertyWithTypeInErrorDelegate.kt");
    }

    @Test
    @TestMetadata("memberPropertyWithTypeInInitializer.kt")
    public void testMemberPropertyWithTypeInInitializer() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/memberPropertyWithTypeInInitializer.kt");
    }

    @Test
    @TestMetadata("memberPropertyWithTypeInInitializerWithoutName.kt")
    public void testMemberPropertyWithTypeInInitializerWithoutName() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/memberPropertyWithTypeInInitializerWithoutName.kt");
    }

    @Test
    @TestMetadata("memberPropertyWithoutTypeInDelegate.kt")
    public void testMemberPropertyWithoutTypeInDelegate() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/memberPropertyWithoutTypeInDelegate.kt");
    }

    @Test
    @TestMetadata("memberPropertyWithoutTypeInErrorDelegate.kt")
    public void testMemberPropertyWithoutTypeInErrorDelegate() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/memberPropertyWithoutTypeInErrorDelegate.kt");
    }

    @Test
    @TestMetadata("memberPropertyWithoutTypeInInitializer.kt")
    public void testMemberPropertyWithoutTypeInInitializer() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/memberPropertyWithoutTypeInInitializer.kt");
    }

    @Test
    @TestMetadata("memberSetterWithTypeWithBody.kt")
    public void testMemberSetterWithTypeWithBody() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/memberSetterWithTypeWithBody.kt");
    }

    @Test
    @TestMetadata("memberSetterWithTypeWithBodyWithoutName.kt")
    public void testMemberSetterWithTypeWithBodyWithoutName() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/memberSetterWithTypeWithBodyWithoutName.kt");
    }

    @Test
    @TestMetadata("memberSetterWithTypeWithoutBody.kt")
    public void testMemberSetterWithTypeWithoutBody() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/memberSetterWithTypeWithoutBody.kt");
    }

    @Test
    @TestMetadata("memberSetterWithTypeWithoutBodyWithoutName.kt")
    public void testMemberSetterWithTypeWithoutBodyWithoutName() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/memberSetterWithTypeWithoutBodyWithoutName.kt");
    }

    @Test
    @TestMetadata("memberSetterWithoutTypeWithBody.kt")
    public void testMemberSetterWithoutTypeWithBody() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/memberSetterWithoutTypeWithBody.kt");
    }

    @Test
    @TestMetadata("memberSetterWithoutTypeWithoutBody.kt")
    public void testMemberSetterWithoutTypeWithoutBody() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/memberSetterWithoutTypeWithoutBody.kt");
    }

    @Test
    @TestMetadata("rawContract.kt")
    public void testRawContract() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/rawContract.kt");
    }

    @Test
    @TestMetadata("topLevelFunctionWithBodyWithoutTypeWithoutName.kt")
    public void testTopLevelFunctionWithBodyWithoutTypeWithoutName() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelFunctionWithBodyWithoutTypeWithoutName.kt");
    }

    @Test
    @TestMetadata("topLevelFunctionWithTypeWithBody.kt")
    public void testTopLevelFunctionWithTypeWithBody() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelFunctionWithTypeWithBody.kt");
    }

    @Test
    @TestMetadata("topLevelFunctionWithTypeWithBodyDumpFile.kt")
    public void testTopLevelFunctionWithTypeWithBodyDumpFile() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelFunctionWithTypeWithBodyDumpFile.kt");
    }

    @Test
    @TestMetadata("topLevelFunctionWithTypeWithoutBody.kt")
    public void testTopLevelFunctionWithTypeWithoutBody() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelFunctionWithTypeWithoutBody.kt");
    }

    @Test
    @TestMetadata("topLevelFunctionWithoutBodyWithTypeWithoutName.kt")
    public void testTopLevelFunctionWithoutBodyWithTypeWithoutName() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelFunctionWithoutBodyWithTypeWithoutName.kt");
    }

    @Test
    @TestMetadata("topLevelFunctionWithoutBodyWithoutTypeWithoutName.kt")
    public void testTopLevelFunctionWithoutBodyWithoutTypeWithoutName() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelFunctionWithoutBodyWithoutTypeWithoutName.kt");
    }

    @Test
    @TestMetadata("topLevelFunctionWithoutTypeWithBody.kt")
    public void testTopLevelFunctionWithoutTypeWithBody() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelFunctionWithoutTypeWithBody.kt");
    }

    @Test
    @TestMetadata("topLevelFunctionWithoutTypeWithoutBody.kt")
    public void testTopLevelFunctionWithoutTypeWithoutBody() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelFunctionWithoutTypeWithoutBody.kt");
    }

    @Test
    @TestMetadata("topLevelGetterWithTypeWithBody.kt")
    public void testTopLevelGetterWithTypeWithBody() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelGetterWithTypeWithBody.kt");
    }

    @Test
    @TestMetadata("topLevelGetterWithTypeWithBodyWithoutName.kt")
    public void testTopLevelGetterWithTypeWithBodyWithoutName() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelGetterWithTypeWithBodyWithoutName.kt");
    }

    @Test
    @TestMetadata("topLevelGetterWithTypeWithoutBody.kt")
    public void testTopLevelGetterWithTypeWithoutBody() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelGetterWithTypeWithoutBody.kt");
    }

    @Test
    @TestMetadata("topLevelGetterWithTypeWithoutBodyWithoutName.kt")
    public void testTopLevelGetterWithTypeWithoutBodyWithoutName() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelGetterWithTypeWithoutBodyWithoutName.kt");
    }

    @Test
    @TestMetadata("topLevelGetterWithoutTypeWithBody.kt")
    public void testTopLevelGetterWithoutTypeWithBody() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelGetterWithoutTypeWithBody.kt");
    }

    @Test
    @TestMetadata("topLevelGetterWithoutTypeWithoutBody.kt")
    public void testTopLevelGetterWithoutTypeWithoutBody() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelGetterWithoutTypeWithoutBody.kt");
    }

    @Test
    @TestMetadata("topLevelPropertyWithTypeInDelegate.kt")
    public void testTopLevelPropertyWithTypeInDelegate() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelPropertyWithTypeInDelegate.kt");
    }

    @Test
    @TestMetadata("topLevelPropertyWithTypeInDelegateWithoutName.kt")
    public void testTopLevelPropertyWithTypeInDelegateWithoutName() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelPropertyWithTypeInDelegateWithoutName.kt");
    }

    @Test
    @TestMetadata("topLevelPropertyWithTypeInErrorDelegate.kt")
    public void testTopLevelPropertyWithTypeInErrorDelegate() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelPropertyWithTypeInErrorDelegate.kt");
    }

    @Test
    @TestMetadata("topLevelPropertyWithTypeInInititalzer.kt")
    public void testTopLevelPropertyWithTypeInInititalzer() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelPropertyWithTypeInInititalzer.kt");
    }

    @Test
    @TestMetadata("topLevelPropertyWithTypeInInititalzerWithoutName.kt")
    public void testTopLevelPropertyWithTypeInInititalzerWithoutName() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelPropertyWithTypeInInititalzerWithoutName.kt");
    }

    @Test
    @TestMetadata("topLevelPropertyWithoutTypeInDelegate.kt")
    public void testTopLevelPropertyWithoutTypeInDelegate() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelPropertyWithoutTypeInDelegate.kt");
    }

    @Test
    @TestMetadata("topLevelPropertyWithoutTypeInErrorDelegate.kt")
    public void testTopLevelPropertyWithoutTypeInErrorDelegate() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelPropertyWithoutTypeInErrorDelegate.kt");
    }

    @Test
    @TestMetadata("topLevelPropertyWithoutTypeInInititalzer.kt")
    public void testTopLevelPropertyWithoutTypeInInititalzer() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelPropertyWithoutTypeInInititalzer.kt");
    }

    @Test
    @TestMetadata("topLevelSetterWithTypeWithBody.kt")
    public void testTopLevelSetterWithTypeWithBody() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelSetterWithTypeWithBody.kt");
    }

    @Test
    @TestMetadata("topLevelSetterWithTypeWithBodyWithoutName.kt")
    public void testTopLevelSetterWithTypeWithBodyWithoutName() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelSetterWithTypeWithBodyWithoutName.kt");
    }

    @Test
    @TestMetadata("topLevelSetterWithTypeWithoutBody.kt")
    public void testTopLevelSetterWithTypeWithoutBody() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelSetterWithTypeWithoutBody.kt");
    }

    @Test
    @TestMetadata("topLevelSetterWithTypeWithoutBodyWithoutName.kt")
    public void testTopLevelSetterWithTypeWithoutBodyWithoutName() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelSetterWithTypeWithoutBodyWithoutName.kt");
    }

    @Test
    @TestMetadata("topLevelSetterWithoutTypeWithBody.kt")
    public void testTopLevelSetterWithoutTypeWithBody() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelSetterWithoutTypeWithBody.kt");
    }

    @Test
    @TestMetadata("topLevelSetterWithoutTypeWithoutBody.kt")
    public void testTopLevelSetterWithoutTypeWithoutBody() throws Exception {
        runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelSetterWithoutTypeWithoutBody.kt");
    }
}
