import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
		
		Map<String, Object> pojoMap = new HashMap<String, Object>();
		Map<String, Object> customFieldList = new HashMap<String, Object>();
		pojoMap.put("customFieldList", customFieldList);
		List<Map<String, Object>> customField = new ArrayList<Map<String, Object>>();
		customFieldList.put("customField", customField);
		
		Map<String, Object> multiSelectField = new HashMap<String, Object>();
		customField.add(multiSelectField);
		
		List<Map<String, Object>> customFieldMultiList = new ArrayList<Map<String, Object>>();
		multiSelectField.put("MultiSelectCustomFieldRef__69__custrecord10",
				customFieldMultiList);

		Map<String, Object> multiSelectFieldEntry = new HashMap<String, Object>();
		Map<String, Object> multiSelectFieldEntry2 = new HashMap<String, Object>();


		multiSelectFieldEntry.put("internalId", "1");
		multiSelectFieldEntry.put("name", "Accounts Receivable");
		multiSelectFieldEntry.put("typeId", -215);
		customFieldMultiList.add(multiSelectFieldEntry);

		multiSelectFieldEntry2.put("internalId", "2");
		multiSelectFieldEntry2.put("name", "Banck");
		multiSelectFieldEntry2.put("typeId", -213);
		customFieldMultiList.add(multiSelectFieldEntry2);


		return pojoMap;