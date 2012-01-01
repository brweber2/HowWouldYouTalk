package pkg;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DollHierarchyTest
{
    @Test
    public void testParents()
    {
        DollHierarchy dollHierarchy = new DollHierarchy();
        
        Assert.assertEquals( null, dollHierarchy.getParentsFor( DollType.A ) );
        Assert.assertEquals( null, dollHierarchy.getParentsFor( DollType.B ) );
        Assert.assertEquals( null, dollHierarchy.getParentsFor( DollType.C ) );
        Assert.assertEquals( null, dollHierarchy.getParentsFor( DollType.D ) );

        Assert.assertEquals( asSet( DollType.A ), dollHierarchy.getParentsFor( DollType.E ) );
        Assert.assertEquals( asSet( DollType.A ), dollHierarchy.getParentsFor( DollType.F ) );

        Assert.assertEquals( asSet( DollType.C, DollType.E, DollType.G ), dollHierarchy.getParentsFor( DollType.G ) );
        Assert.assertEquals( asSet( DollType.C, DollType.E, DollType.G ), dollHierarchy.getParentsFor( DollType.H ) );
    }
    
    @Test
    public void testChildren()
    {
        DollHierarchy dollHierarchy = new DollHierarchy();
        
        Assert.assertEquals( asSet( DollType.E, DollType.F ), dollHierarchy.getChildrenFor( DollType.A ) );
        Assert.assertEquals( null, dollHierarchy.getChildrenFor( DollType.B ) );

        Assert.assertEquals( asSet( DollType.G, DollType.H ), dollHierarchy.getChildrenFor( DollType.C ) );
        Assert.assertEquals( null, dollHierarchy.getChildrenFor( DollType.D ) );

        Assert.assertEquals( asSet( DollType.G, DollType.H ), dollHierarchy.getChildrenFor( DollType.E ) );
        Assert.assertEquals( null, dollHierarchy.getChildrenFor( DollType.F ) );

        Assert.assertEquals( asSet( DollType.G, DollType.H ), dollHierarchy.getChildrenFor( DollType.G ) );
        Assert.assertEquals( null, dollHierarchy.getChildrenFor( DollType.H ) );
    }
    
    private Set<DollType> asSet( DollType ... dollTypes )
    {
        Set<DollType> set = new HashSet<DollType>();
        
        if ( dollTypes != null )
        {
            Collections.addAll( set, dollTypes );
        }
        return set;
    }
}
