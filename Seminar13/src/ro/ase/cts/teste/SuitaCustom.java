package ro.ase.cts.teste;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.categorii.GetPromovabilitateCategory;
import ro.ase.cts.categorii.TesteNormaleCategory;
import ro.ase.cts.categorii.TesteUrgenteCategory;

@RunWith(Categories.class)
@SuiteClasses({TestGrupa.class, TestGrupaCuFixture.class, TestGrupaWithDummy.class,
		TestPromovabilitateWithFake.class, TestPromovabilitateWithStub.class })
@IncludeCategory(GetPromovabilitateCategory.class)
@ExcludeCategory({TesteNormaleCategory.class, TesteUrgenteCategory.class})
public class SuitaCustom {

}
