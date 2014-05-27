package edu.vuum.mocca;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.Lock;

/**
 * @class SimpleAtomicLong
 *
 * @brief This class implements a subset of the
 *        java.util.concurrent.atomic.SimpleAtomicLong class using a
 *        ReentrantReadWriteLock to illustrate how they work.
 */
class SimpleAtomicLong
{
    /**
     * The value that's manipulated atomically via the methods.
     */
    private long mValue;
    
    /**
     * The ReentrantReadWriteLock used to serialize access to mValue.
     */
<<<<<<< Updated upstream:grading-drivers/week-2-assignment-1/src/edu/vuum/mocca/SimpleAtomicLong.java

    // TODO -- you fill in here by replacing the null with an
    // initialization of ReentrantReadWriteLock.
    private ReentrantReadWriteLock mRWLock = null;
=======
    // TODO - replace the null with the appropriate initialization:
    private ReentrantReadWriteLock mRWLock = new ReentrantReadWriteLock();
>>>>>>> Stashed changes:assignments/week-2-assignment-1/src/SimpleAtomicLong.java

    /**
     * Creates a new SimpleAtomicLong with the given initial value.
     */
    public SimpleAtomicLong(long initialValue)
    {
<<<<<<< Updated upstream:grading-drivers/week-2-assignment-1/src/edu/vuum/mocca/SimpleAtomicLong.java
        // TODO -- you fill in here
=======
        // TODO - you fill in here
    	mValue = initialValue;
>>>>>>> Stashed changes:assignments/week-2-assignment-1/src/SimpleAtomicLong.java
    }

    /**
     * @brief Gets the current value.
     * 
     * @returns The current value
     */
    public long get()
    {
        long value;
<<<<<<< Updated upstream:grading-drivers/week-2-assignment-1/src/edu/vuum/mocca/SimpleAtomicLong.java

        // TODO -- you fill in here

=======
        // TODO - you fill in here, using a readLock()
        mRWLock.readLock().lock();
        value = mValue;
        mRWLock.readLock().unlock();
>>>>>>> Stashed changes:assignments/week-2-assignment-1/src/SimpleAtomicLong.java
        return value;
    }

    /**
     * @brief Atomically decrements by one the current value
     *
     * @returns the updated value
     */
    public long decrementAndGet()
    {
<<<<<<< Updated upstream:grading-drivers/week-2-assignment-1/src/edu/vuum/mocca/SimpleAtomicLong.java
        long value = 0;

        // TODO -- you fill in here

=======
        long value;
        // TODO - you fill in here, using a writeLock()
        mRWLock.writeLock().lock();
        value = --mValue;
        mRWLock.writeLock().unlock();
>>>>>>> Stashed changes:assignments/week-2-assignment-1/src/SimpleAtomicLong.java
        return value;
    }

    /**
     * @brief Atomically increments by one the current value
     *
     * @returns the previous value
     */
    public long getAndIncrement()
    {
<<<<<<< Updated upstream:grading-drivers/week-2-assignment-1/src/edu/vuum/mocca/SimpleAtomicLong.java
        long value = 0;

        // TODO -- you fill in here

=======
        long value;
        // TODO - you fill in here, using a writeLock()
        mRWLock.writeLock().lock();
        value = mValue++;
        mRWLock.writeLock().unlock();        
>>>>>>> Stashed changes:assignments/week-2-assignment-1/src/SimpleAtomicLong.java
        return value;
    }

    /**
     * @brief Atomically decrements by one the current value
     *
     * @returns the previous value
     */
    public long getAndDecrement()
    {
<<<<<<< Updated upstream:grading-drivers/week-2-assignment-1/src/edu/vuum/mocca/SimpleAtomicLong.java
        long value = 0;

        // TODO -- you fill in here

=======
        long value;
        // TODO - you fill in here, using a writeLock()
        mRWLock.writeLock().lock();
        value = mValue--;
        mRWLock.writeLock().unlock();        
>>>>>>> Stashed changes:assignments/week-2-assignment-1/src/SimpleAtomicLong.java
        return value;
    }

    /**
     * @brief Atomically increments by one the current value
     *
     * @returns the updated value
     */
    public long incrementAndGet()
    {
<<<<<<< Updated upstream:grading-drivers/week-2-assignment-1/src/edu/vuum/mocca/SimpleAtomicLong.java
        long value = 0;

        // TODO -- you fill in here

=======
        long value;
        // TODO - you fill in here, using a writeLock()
        mRWLock.writeLock().lock();
        value = ++mValue;
        mRWLock.writeLock().unlock();                
>>>>>>> Stashed changes:assignments/week-2-assignment-1/src/SimpleAtomicLong.java
        return value;
    }
}

