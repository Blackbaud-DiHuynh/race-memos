package racememos.core;

import com.blackbaud.testsupport.RandomGenerator;
import lombok.experimental.Delegate;

public class CoreARandom {

    public static final CoreARandom aRandom = new CoreARandom();

    @Delegate
    private RandomCoreBuilderSupport randomCoreBuilderSupport = new RandomCoreBuilderSupport();
    @Delegate
    private RandomGenerator randomGenerator = new RandomGenerator();

}
