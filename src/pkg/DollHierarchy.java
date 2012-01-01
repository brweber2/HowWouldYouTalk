package pkg;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DollHierarchy
{
    
    private static final Map<DollType,Set<DollType>> parentHierarchy = new HashMap<DollType,Set<DollType>>();

    private static final Map<DollType,Set<DollType>> childrenHierarchy = new HashMap<DollType,Set<DollType>>();
    
    static
    {
        parentHierarchy.put( DollType.A, null );
        parentHierarchy.put( DollType.B, null );
        parentHierarchy.put( DollType.C, null );
        parentHierarchy.put( DollType.D, null );
        
        parentHierarchy.put( DollType.E, new HashSet<DollType> ( Arrays.asList( DollType.A ) ) );
        parentHierarchy.put( DollType.F, new HashSet<DollType> ( Arrays.asList( DollType.A ) ) );

        parentHierarchy.put( DollType.G, new HashSet<DollType> ( Arrays.asList( DollType.C, DollType.E, DollType.G ) ) );
        parentHierarchy.put( DollType.H, new HashSet<DollType> ( Arrays.asList( DollType.C, DollType.E, DollType.G ) ) );
    }
    
    static
    {
        childrenHierarchy.put( DollType.A, new HashSet<DollType>( Arrays.asList( DollType.E, DollType.F ) ) );
        childrenHierarchy.put( DollType.B, null );
        childrenHierarchy.put( DollType.C, new HashSet<DollType>( Arrays.asList( DollType.G, DollType.H ) ) );
        childrenHierarchy.put( DollType.D, null );

        childrenHierarchy.put( DollType.E, new HashSet<DollType>( Arrays.asList( DollType.G, DollType.H ) ) );
        childrenHierarchy.put( DollType.F, null );

        childrenHierarchy.put( DollType.G, new HashSet<DollType>( Arrays.asList( DollType.G, DollType.H ) ) );
        childrenHierarchy.put( DollType.H, null );
    }
    
    public Set<DollType> getParentsFor( DollType dollType )
    {
        return parentHierarchy.get( dollType );
    }

    public Set<DollType> getChildrenFor( DollType dollType )
    {
        return childrenHierarchy.get( dollType );
    }
    
}
