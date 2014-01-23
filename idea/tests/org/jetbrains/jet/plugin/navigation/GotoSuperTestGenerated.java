/*
 * Copyright 2010-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.plugin.navigation;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import java.util.regex.Pattern;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.plugin.navigation.AbstractGotoSuperTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/navigation/gotoSuper")
public class GotoSuperTestGenerated extends AbstractGotoSuperTest {
    public void testAllFilesPresentInGotoSuper() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/navigation/gotoSuper"), Pattern.compile("^(.+)\\.test$"), true);
    }
    
    @TestMetadata("ClassSimple.test")
    public void testClassSimple() throws Exception {
        doTest("idea/testData/navigation/gotoSuper/ClassSimple.test");
    }
    
    @TestMetadata("DelegatedFun.test")
    public void testDelegatedFun() throws Exception {
        doTest("idea/testData/navigation/gotoSuper/DelegatedFun.test");
    }
    
    @TestMetadata("DelegatedProperty.test")
    public void testDelegatedProperty() throws Exception {
        doTest("idea/testData/navigation/gotoSuper/DelegatedProperty.test");
    }
    
    @TestMetadata("FakeOverrideFun.test")
    public void testFakeOverrideFun() throws Exception {
        doTest("idea/testData/navigation/gotoSuper/FakeOverrideFun.test");
    }
    
    @TestMetadata("FakeOverrideFunWithMostRelevantImplementation.test")
    public void testFakeOverrideFunWithMostRelevantImplementation() throws Exception {
        doTest("idea/testData/navigation/gotoSuper/FakeOverrideFunWithMostRelevantImplementation.test");
    }
    
    @TestMetadata("FakeOverrideProperty.test")
    public void testFakeOverrideProperty() throws Exception {
        doTest("idea/testData/navigation/gotoSuper/FakeOverrideProperty.test");
    }
    
    @TestMetadata("FunctionSimple.test")
    public void testFunctionSimple() throws Exception {
        doTest("idea/testData/navigation/gotoSuper/FunctionSimple.test");
    }
    
    @TestMetadata("ObjectSimple.test")
    public void testObjectSimple() throws Exception {
        doTest("idea/testData/navigation/gotoSuper/ObjectSimple.test");
    }
    
    @TestMetadata("PropertySimple.test")
    public void testPropertySimple() throws Exception {
        doTest("idea/testData/navigation/gotoSuper/PropertySimple.test");
    }
    
    @TestMetadata("TraitSimple.test")
    public void testTraitSimple() throws Exception {
        doTest("idea/testData/navigation/gotoSuper/TraitSimple.test");
    }
    
}
