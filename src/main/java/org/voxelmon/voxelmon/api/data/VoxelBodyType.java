package org.voxelmon.voxelmon.api.data;

//TODO: string forms
public enum VoxelBodyType {
	HEAD_ONLY("head_only"),
	HEAD_AND_LEGS("head_and_legs"),
	FINS("fins"),
	INSECTOID("insectoid"),
	QUADRUPED("quadruped"),
	MULTI_WINGED("multi_winged"),
	MULTI_BODY("multi_body"),
	TENTACLED("tentacled"),
	HEAD_AND_BASE("head_and_base"),
	BIPEDAL_TAILED("bipedal_tailed"),
	HUMANOID("humanoid"),
	SINGLE_WINGED("single_winged"),
	SERPENTINE("serpentine"),
	HEAD_AND_ARMS("head_and_arms");

	private final String name;

	VoxelBodyType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static VoxelBodyType forName(String name) {
		for (VoxelBodyType type : VoxelBodyType.values()) {
			if (type.getName().equals(name)) {
				return type;
			}
		}
		return HEAD_ONLY;
	}
}
